/*
 * Copyright 2019  , MostafaAbdelazim
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.isca.iscagroup.adapter

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.isca.iscagroup.R

@BindingAdapter("imageUrl")
fun setImageUrl(imageView: ImageView, url: String?) {
    url?.let {
        if (url.isEmpty()) {
            imageView.setImageResource(R.drawable.ic_broken_image_black_24dp)
            imageView.scaleType = ImageView.ScaleType.CENTER_INSIDE
        } else {
            Glide.with(imageView.context).applyDefaultRequestOptions(RequestOptions()
                    .placeholder(R.drawable.ic_image_black_24dp)
                    .error(R.drawable.ic_signal_wifi_off_black_24dp))
                    .load(url).into(imageView)
        }
    }
}