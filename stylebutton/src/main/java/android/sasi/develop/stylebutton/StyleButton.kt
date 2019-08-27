package android.sasi.develop.stylebutton

import android.content.Context
import android.util.AttributeSet
import android.widget.Button

class StyleButton : Button {

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


    private fun initStyleButton(attrs: AttributeSet?) {
        val typedArray = context.obtainStyledAttributes(attrs, R.styleable.cusbutton)
        val isborder = typedArray.getBoolean(R.styleable.cusbutton_is_dot_border, false)
       
        typedArray.recycle()
    }

}