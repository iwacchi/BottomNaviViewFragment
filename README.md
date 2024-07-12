#### 1. リポジトリ名

# BottomNaviViewFragment



### 2. 使用言語とその他バージョン
- 使用言語

  Java言語(Android)
- 開発環境

  Android Studio(ver.3.4.2)
  
  Java ver.1.8.0_152
  
- 使用仮想デバイス

  Pixel 2 API 26(Android 8.0.0, API 26)

### 3. セットアップ方法

  &nbsp;このリポジトリをダウンロードし、お使いのAndroid Studioを起動。<br>
  Welcome to Android Studio(プロジェクトの選択画面)で`Open an existing Android Studio project`を選択し、このリポジトリを選択。
  
### 4. 説明
  
  &nbsp;BottomNaviViewFragmentとは、`BottomNavigationView`と`Fragment`を利用した画面遷移です。<br>
  BottomNavigationViewのアイコンをタップすると、それに対応したFragmentに画面が切り替わります。<br>
  BottomNaviViewFragmentでは、`HomeFragment`、`DashboardFragment`、`NotificationsFragment`の三つのFragmentが存在します。<br>
  
  主なディレクトリ構成図は以下の通りです。<br>
  <pre>
  app
   └ src
      └ main
          ├ java
          |   ├ fragments
          |   |     ├ DashboardFragment.java
          |   |     ├ HomeFragment.java
          |   |     └ NotificationsFragment.java
          |   └ BottomNavigationViewActivity.java(MainActivity)
          ├ layouts
          |   ├ fragments(res)
          |   |     └ layout
          |   |          ├ dashboard_fragment.xml
          |   |          ├ home_fragment.xml
          |   |          └ notifications_fragment.xml
          |   └ main(res)
          |       └ layout
          |            └ bottom_navigation_view.xml
          └ res(res)
             └ ...
</pre>

&nbsp;layoutフォルダーを細分化するためにlayout関連のxmlファイルをlayousフォルダーに集約しています。<br>
細分化するためのセットアップ方法は参考文献に添付しております。<br>

### 5. 作成者
iwacchi<br>
&nbsp; Qiita &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; ([@iwacchi](https://qiita.com/iwacchi))<br>
&nbsp; GitHub &nbsp; ([github.com/iwacchi](https://github.com/iwacchi))<br>

#### 6. 参考文献
【Android】Layoutファイルをフォルダ分けする - Qiita<br>
https://qiita.com/KokiEnomoto/items/52c6da070fdf4ba60f89
