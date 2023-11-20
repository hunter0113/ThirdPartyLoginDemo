import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import com.evan.thirdpartylogindemo.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 找到按鈕
        val googleLoginButton: Button = findViewById(R.id.GoogleLogin)

        // 設置按鈕的點擊監聽器
        googleLoginButton.setOnClickListener {

        }
    }
}
