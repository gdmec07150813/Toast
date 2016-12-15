package toast.s07150813.gdmec.edu.cn.toast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void bt1(View v){
        Toast.makeText(this,"我早就会了",Toast.LENGTH_LONG).show();
    }
    public void bt2(View v){
        //创建填充器
        LayoutInflater layoutInflater = getLayoutInflater();
        //填充布局文件到View视图
        View view = layoutInflater.inflate(R.layout.toastroot,null);
        //创建线性布局
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.ly1);
        //将toasinfo布局文件镶嵌创建的线性布局中
        layoutInflater.inflate(R.layout.toastinfo,linearLayout);
        Toast toast =  new Toast(this);
        toast.setView(view);
        toast.show();
    }
    public void bt3(View v){
         Toast toast = Toast.makeText(this,"我是小黄人",Toast.LENGTH_LONG);
         LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(LinearLayout.VERTICAL);
        //创建图片容器
        ImageView img = new ImageView(this);
        img.setImageResource(R.drawable.yellowman);
        View view  = toast.getView();
        linearLayout.addView(img);
        linearLayout.addView(view);
        toast.setView(linearLayout);
        toast.show();

    }
}
