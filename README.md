# HighSpeedRefreshToast

可以高速更新消失的Toast

集成方法：

Add it in your root build.gradle at the end of repositories:

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
Step 2. Add the dependency

	dependencies {
	        implementation 'com.github.dingbiye:HighSpeedRefreshToast:1.0.2'
	}


使用示例：

如果需要显示一个Toast，
HighSpeedRefreshToast.showToast(this, "仿照implementation库使用，maven使用成功1");
该行代码会立马显示toast。
如果同时立马再次调用
HighSpeedRefreshToast.showToast(this, "仿照implementation库使用，maven使用成功2");
toast中的值会立即更新为  “仿照implementation库使用，maven使用成功2”
如果想立即消失掉toast
HighSpeedRefreshToast.missToast(this);

