package android.sasi.develop.stylebutton

import android.annotation.SuppressLint
import android.content.Context
import android.graphics.Color
import android.graphics.drawable.GradientDrawable
import android.sasi.develop.stylebutton.R.styleable.dot_button_style
import android.util.AttributeSet
import android.widget.Button

class DotButton : Button {

    constructor(context: Context) : this(context, null)

    constructor(context: Context, attrs: AttributeSet?) : this(context, attrs, 0) {
        attrs?.let { initStyleButton(it) }
    }

    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(
        context,
        attrs,
        defStyleAttr
    ) {
        attrs?.let { initStyleButton(it) }
    }


    @SuppressLint("CustomViewStyleable")
    private fun initStyleButton(attrs: AttributeSet?) {
        val typedArray = context.obtainStyledAttributes(attrs, dot_button_style)
        val isBorder = typedArray.getBoolean(R.styleable.dot_button_style_dot_border, false)
        if (isBorder) {
            this.background = context.getDrawable(R.drawable.dot_border)
            val dotColor = typedArray.getColor(R.styleable.dot_button_style_dot_color, Color.BLUE)
            val dotWidth =
                typedArray.getDimensionPixelSize(R.styleable.dot_button_style_dot_width, 10)
            val dotPadding =
                typedArray.getDimensionPixelSize(R.styleable.dot_button_style_dot_padding, 10)
            val dotGapWidth =
                typedArray.getDimensionPixelSize(R.styleable.dot_button_style_dot_gap_width, 5)
            val dotThickness =
                typedArray.getDimensionPixelSize(R.styleable.dot_button_style_dot_thickness, 3)
            this.setPadding(dotPadding, dotPadding, dotPadding, dotPadding)
            val backGround = this.background as GradientDrawable

            backGround.setStroke(dotThickness, dotColor, dotWidth.toFloat(), dotGapWidth.toFloat())

        }
        typedArray.recycle()
    }

}