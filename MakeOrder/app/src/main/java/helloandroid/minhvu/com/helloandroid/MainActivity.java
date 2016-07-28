package helloandroid.minhvu.com.helloandroid;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int quantity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void increaseQuantity(View view)  {
        if(quantity < 100)  {
            quantity++;
            updateQuantity();
            updatePrice();
        }
    }

    public void decreaseQuantity(View view) {
        if(quantity > 0)    {
            quantity--;
            updateQuantity();
            updatePrice();
        }
    }

    public void updateQuantity()    {
        TextView textQuantity = (TextView) this.findViewById(R.id.quantity);
        textQuantity.setText(new String(Integer.toString(quantity)));
    }

    public void updatePrice()   {
        TextView price = (TextView) this.findViewById(R.id.price);
        price.setText("$" + new String(Integer.toString(quantity * 5)));
    }

    public void onOrder(View view)   {

        final TextView thankyou = (TextView) this.findViewById(R.id.thankyou);
        thankyou.setText("Thanks for your order!");

        final Handler handler = new Handler();
        final Runnable runable = new Runnable() {
            @Override
            public void run() {
                thankyou.setText("");
            }
        };
        handler.postDelayed(runable, 2000);
    }
}
