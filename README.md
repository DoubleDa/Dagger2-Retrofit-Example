# Dagger2-Retrofit-Example

## 添加依赖

* 在项目根目录下build.gradle

	 	dependencies {
        	classpath 'com.neenbedankt.gradle.plugins:android-apt:1.8'
    	}
    	
* 在App根目录下build.gradle

		//Dagger2
		compile 'com.google.dagger:dagger:2.0'
    	provided 'com.google.dagger:dagger-compiler:2.0'
    	provided 'org.glassfish:javax.annotation:10.0-b28'
    	
  切记不要忘了申请插件哦！
  
  		apply plugin: 'com.neenbedankt.android-apt'
  		
  		
## 项目使用技术棧

* Dagger2

依赖注入框架

* Retrofit

网络请求框架

* OkHttp

网络请求框架

* Gson

Json解析框架

* Picasso

图片加载框架

* Realm

数据缓存框架

* MVP

App架构选择

## 开发笔记













  		
 
    	
 