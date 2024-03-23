package Activitys;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.example.mitra.R;

public class ImageSliderAdapter extends PagerAdapter {

    private Context context;
    private int[] images;
    private Handler handler;
    private Runnable runnable;
    private final long delayInMillis = 2000; // 2 seconds delay
    private ViewPager viewPager;

    public ImageSliderAdapter(Context context, int[] images) {
        this.context = context;
        this.images = images;
        this.handler = new Handler(Looper.getMainLooper());
        setupAutoScroll();
    }

    private void setupAutoScroll() {
        runnable = new Runnable() {
            @Override
            public void run() {
                int currentItem = getItem(+1);
                viewPager.setCurrentItem(currentItem, true);
                handler.postDelayed(this, delayInMillis);
            }
        };
    }

    private int getItem(int i) {
        int currentItem = viewPager.getCurrentItem();
        int itemCount = getCount();

        int nextItem = currentItem + i;

        // Handle wrapping of items
        if (nextItem >= itemCount) {
            nextItem = nextItem % itemCount;
        } else if (nextItem < 0) {
            nextItem = itemCount - 1;
        }

        return nextItem;
    }

    @Override
    public int getCount() {
        return images.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, final int position) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View itemView = inflater.inflate(R.layout.activity_image_slider_adapter, container, false);

        ImageView imageView = itemView.findViewById(R.id.imageView);
        imageView.setImageResource(images[position]);

        container.addView(itemView);

        //test

        return itemView;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((View) object);
    }

    public void startAutoScroll(ViewPager viewPager) {
        this.viewPager = viewPager;
        setupAutoScroll();
        handler.postDelayed(runnable, delayInMillis);
    }


}
