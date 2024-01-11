/*
 * Copyright 2021 Stream.IO, Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.getstream.androiddeveloperroadmap

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import com.skydoves.landscapist.ImageOptions
import com.skydoves.landscapist.coil.CoilImage
import com.skydoves.landscapist.components.rememberImageComponent
import com.skydoves.landscapist.placeholder.shimmer.ShimmerPlugin
import io.getstream.androiddeveloperroadmap.ui.theme.AndroidDeveloperRoadmapTheme
import io.getstream.androiddeveloperroadmap.ui.theme.shimmerHighLight
import me.saket.telephoto.zoomable.rememberZoomableState
import me.saket.telephoto.zoomable.zoomable

class MainActivity : ComponentActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)

    setContent {
      AndroidDeveloperRoadmapTheme {
        Surface(
          color = MaterialTheme.colorScheme.background
        ) {
          AndroidRoadmap()
        }
      }
    }
  }
}

@Composable
private fun AndroidRoadmap() {
  val background = MaterialTheme.colorScheme.background
  CoilImage(
    modifier = Modifier
      .fillMaxSize()
      .zoomable(rememberZoomableState()),
    imageModel = { "https://user-images.githubusercontent.com/24237865/144350753-5a52e6e5-3517-476c-8e5c-adad919abe8e.png" },
    component = rememberImageComponent {
      // shows a shimmering effect when loading an image.
      +ShimmerPlugin(
        baseColor = background,
        highlightColor = shimmerHighLight
      )
    },
    imageOptions = ImageOptions(contentScale = ContentScale.Fit)
  )
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
private fun DefaultPreview() {
  AndroidDeveloperRoadmapTheme {
    AndroidRoadmap()
  }
}
