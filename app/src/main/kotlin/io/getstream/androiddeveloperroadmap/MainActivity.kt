/*
 * Designed and developed by 2021 skydoves (Jaewoong Eum)
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
import androidx.compose.foundation.layout.height
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.mxalbert.zoomable.Zoomable
import com.skydoves.landscapist.glide.GlideImage
import io.getstream.androiddeveloperroadmap.ui.theme.AndroidDeveloperRoadmapTheme

class MainActivity : ComponentActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)

    setContent {
      AndroidDeveloperRoadmapTheme {
        Surface(
          modifier = Modifier.fillMaxSize(),
          color = MaterialTheme.colors.background
        ) {
          Roadmap()
        }
      }
    }
  }
}

@Composable
private fun Roadmap() {
  Zoomable(
    modifier = Modifier.height(3200.dp)
  ) {
    GlideImage(
      imageModel = "https://user-images.githubusercontent.com/24237865/144011218-1d141580-0ef9-467d-854c-6f7786d7c823.png",
      modifier = Modifier.fillMaxSize(),
      previewPlaceholder = R.drawable.roadmap_preview,
      contentScale = ContentScale.Fit
    )
  }
}

@Preview(showBackground = true)
@Composable
private fun DefaultPreview() {
  AndroidDeveloperRoadmapTheme {
    Roadmap()
  }
}
