/*
 * Copyright 2014 Google Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.samples.search.recipe_app.client;

import android.app.Activity;
import android.os.Bundle;

import com.google.android.gms.analytics.Tracker;
import com.google.samples.search.recipe_app.R;

/**
 * This Activity class defines the home screen for the recipe app.
 */
public class HomeActivity extends Activity {

    private Tracker mTracker;
    RecipeApplication mApplication;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        mApplication = (RecipeApplication) getApplication();
        mTracker = mApplication.getDefaultTracker();
    }

    @Override
    protected void onStart() {
        super.onStart();

        // Call the Google Analytics API
        mApplication.trackScreenView(getIntent(), "Home screen");
    }
}
