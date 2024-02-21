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
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import io.getstream.androiddeveloperroadmap.ui.theme.AndroidDeveloperRoadmapTheme
import me.saket.telephoto.zoomable.coil.ZoomableAsyncImage

class MainActivity : ComponentActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)

    setContent {
      AndroidDeveloperRoadmapTheme {
        Surface(
          color = MaterialTheme.colors.background
        ) {
          AndroidRoadmap()
        }
      }
    }
  }
}

@Composable
private fun AndroidRoadmap() {
  ZoomableAsyncImage(
    modifier = Modifier.fillMaxSize(),
    model = "https://user-images.githubusercontent.com/24237865/144350753-5a52e6e5-3517-476c-8e5c-adad919abe8e.png",
    contentDescription = null
  )
}

@Preview(showBackground = true)
@Composable
private fun DefaultPreview() {
  AndroidDeveloperRoadmapTheme {
    AndroidRoadmap()
  }
}
