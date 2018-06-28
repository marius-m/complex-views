package lt.markmerkk.app_ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Cool custom view that is pricy to be always inflated into
 */
public class ComplexCustomView extends LinearLayout {

    public ComplexCustomView(Context context) {
        super(context);
        init(null, 0);
    }

    public ComplexCustomView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(attrs, 0);
    }

    public ComplexCustomView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init(attrs, defStyle);
    }

    private void init(AttributeSet attrs, int defStyle) {
        TextView textView = new TextView(getContext());
        textView.setText("Hello world");
        addView(
            textView,
            new LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
            )
        );
    }

}
