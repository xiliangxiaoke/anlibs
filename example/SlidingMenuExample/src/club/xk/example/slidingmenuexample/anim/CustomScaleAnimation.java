package club.xk.example.slidingmenuexample.anim;

import android.graphics.Canvas;

import club.xk.example.slidingmenuexample.R;
import club.xlxk.libs.slidingmenu.lib.SlidingMenu.CanvasTransformer;


public class CustomScaleAnimation extends CustomAnimation {

	public CustomScaleAnimation() {
		super(R.string.anim_scale, new CanvasTransformer() {
			@Override
			public void transformCanvas(Canvas canvas, float percentOpen) {
				canvas.scale(percentOpen, 1, 0, 0);
			}			
		});
	}

}
