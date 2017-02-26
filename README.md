# GuidelinesCompatToolbar
Application and Toolbar styles to achieve layout compatible with Material Design guidelines.

You can read more about it on blog post https://medium.com/@lucasurbas/making-android-toolbar-responsive-2627d4e07129


### Download
```sh
dependencies {
    compile 'com.lucasurbas:guidelinescompattoolbar:1.0.0'
}
```
   
### Usage
Make your Application Theme extends one of Theme.GuidelinesCompat
- Theme.GuidelinesCompat.Light.DarkToolbar
- Theme.GuidelinesCompat.Light.LightToolbar
- Theme.GuidelinesCompat.Light.ColoredToolbar
- Theme.GuidelinesCompat.Dark.DarkToolbar

```sh
<style name="Theme.MyApp" parent="Theme.GuidelinesCompat.Light.DarkToolbar">

    <item name="colorPrimary">@color/colorPrimary</item>
    <item name="colorPrimaryDark">@color/colorPrimaryDark</item>
    <item name="colorAccent">@color/colorAccent</item>
    ...

</style>
```
Add toolbar Theme which extends one of Theme.GuidelinesCompat.Toolbar
- Theme.GuidelinesCompat.LightToolbar
- Theme.GuidelinesCompat.ColoredToolbar
- Theme.GuidelinesCompat.DarkToolbar
```sh
<style name="Theme.MyApp.Toolbar" parent="Theme.GuidelinesCompat.DarkToolbar">

    <item name="colorControlHighlight">@color/colorAccent</item>
    ...

</style>
```
If your App uses ActionBar, specify newly created theme
```sh
<style name="Theme.MyApp" parent="Theme.GuidelinesCompat.Light.DarkToolbar">
    
    ...
    <!-- Actionbar theme -->
    <item name="actionBarTheme">@style/Theme.MyApp.Toolbar</item>

</style>
```
If your App uses standalone Toolbar in layout file, make sure to connect newly created theme
```sh
<android.support.v7.widget.Toolbar
    android:id="@+id/toolbar"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:background="@color/colorPrimary"
    android:minHeight="?attr/actionBarSize"
    ...
    app:theme="@style/Theme.MyApp.Toolbar" />
```

### License
```sh
Copyright 2017 Lucas Urbas

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```
