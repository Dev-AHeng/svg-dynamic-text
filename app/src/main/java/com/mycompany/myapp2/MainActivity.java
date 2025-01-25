package com.mycompany.myapp2;

import android.app.*;
import android.os.*;
import com.eftimoff.androipathview.PathView;
import android.view.animation.LinearInterpolator;
//使用前需要在build.gradle里配置这句话，compile 'com.eftimoff:android-pathview:1.0.8'
//我已经加了，可以自己看看
public class MainActivity extends Activity 
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		PathView pathView=(PathView) findViewById(R.id.pathView);
		//获取路径动画
		pathView.getPathAnimator()
		//应该是延迟这里的数值是毫秒
		.delay(1000)
		//时长
		.duration(3000)
		//一个匀速的加速器
		.interpolator(new LinearInterpolator())
		//动画开始的监听
			.listenerStart(new PathView.AnimatorBuilder.ListenerStart(){

				@Override
				public void onAnimationStart()
				{
					// TODO: Implement this method
				}
			})
			//同上结束
			.listenerEnd(new PathView.AnimatorBuilder.ListenerEnd(){

				@Override
				public void onAnimationEnd()
				{
					// TODO: Implement this method
				}
			}).start();
    }
}
