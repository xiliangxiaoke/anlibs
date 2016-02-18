package club.xk.example.slidingmenuexample.anim;

import club.xk.example.slidingmenuexample.BaseActivity;
import club.xk.example.slidingmenuexample.R;
import club.xk.example.slidingmenuexample.SampleListFragment;
import club.xlxk.libs.slidingmenu.lib.SlidingMenu;
import club.xlxk.libs.slidingmenu.lib.SlidingMenu.CanvasTransformer;
import android.os.Bundle;
import android.view.Menu;


public abstract class CustomAnimation extends BaseActivity {
	
	private CanvasTransformer mTransformer;
	
	public CustomAnimation(int titleRes, CanvasTransformer transformer) {
		super(titleRes);
		mTransformer = transformer;
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		// set the Above View
		setContentView(R.layout.content_frame);
		getSupportFragmentManager()
		.beginTransaction()
		.replace(R.id.content_frame, new SampleListFragment())
		.commit();
		
		SlidingMenu sm = getSlidingMenu();
		setSlidingActionBarEnabled(true);
		sm.setBehindScrollScale(0.0f);
		sm.setBehindCanvasTransformer(mTransformer);
	}

}
