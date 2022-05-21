package com.example.test_nn

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.test_nn.databinding.ActivityMainBinding
import com.navercorp.nid.NaverIdLoginSDK
import com.navercorp.nid.oauth.OAuthLoginCallback

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val oauthLoginCallback = object : OAuthLoginCallback {
            override fun onSuccess() {
                // 네이버 로그인 인증이 성공했을 때 수행할 코드 추가
                Log.d("Naver", "onSuccess: ")
            }
            override fun onFailure(httpStatus: Int, message: String) {
                Log.d("Naver", "onFailure: ")
            }
            override fun onError(errorCode: Int, message: String) {
                onFailure(errorCode, message)
            }
        }
        binding.buttonOAuthLoginImg.setOAuthLoginCallback(oauthLoginCallback)


        NaverIdLoginSDK.initialize(this, "", "", "Test_Nn")


        NaverIdLoginSDK.authenticate(this, oauthLoginCallback)
    }

}