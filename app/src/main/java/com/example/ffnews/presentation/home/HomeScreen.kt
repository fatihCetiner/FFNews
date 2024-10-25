package com.example.ffnews.presentation.home

import androidx.compose.foundation.basicMarquee
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import androidx.paging.compose.LazyPagingItems
import com.example.ffnews.R
import com.example.ffnews.domain.model.Article
import com.example.ffnews.presentation.Dimens.MediumPadding1
import com.example.ffnews.presentation.common.ArticlesList
import com.example.ffnews.presentation.common.SearchBar
import com.example.ffnews.presentation.navgraph.Route


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(
    articles: LazyPagingItems<Article>,
    navigate: (String) -> Unit
) {
    val titles by remember {
        derivedStateOf {
            if (articles.itemCount > 10) {
                articles.itemSnapshotList.items
                    .slice(IntRange(start = 0, endInclusive = 9))
                    .joinToString(separator = " \uD83d\uDFE5 ") {
                        it.title
                    }
            } else {
                ""
            }
        }
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(top = MediumPadding1)
            .statusBarsPadding()
    ) {

        Text(
            text = "FF News",
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = MediumPadding1)
                .basicMarquee(),
            color = colorResource(id = R.color.teal_700),
            fontSize = 30.sp,
            fontWeight = FontWeight.SemiBold,
            fontStyle = FontStyle.Italic
        )

        Spacer(modifier = Modifier.height(MediumPadding1))

        SearchBar(
            modifier = Modifier.padding(horizontal = MediumPadding1),
            text = "",
            readOnly = true,
            onValueChange = {},
            onClick = {
                navigate(Route.SearchScreen.route)
            },
            onSearch = {}
        )

        Spacer(modifier = Modifier.height(MediumPadding1))

        Text(
            text = titles,
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = MediumPadding1)
                .basicMarquee(),
            fontSize = 12.sp,
            color = colorResource(id = R.color.placeholder)
        )

        Spacer(modifier = Modifier.height(MediumPadding1))

        ArticlesList(
            modifier = Modifier.padding(horizontal = MediumPadding1),
            articles = articles,
            onClick = {
                navigate(Route.DetailsScreen.route)
            }
        )
    }
}