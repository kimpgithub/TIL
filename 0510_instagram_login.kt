package com.example.a0509_jetpackcompose

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun InstagramLoginScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(32.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top
    ) {
        Spacer(modifier = Modifier.height(30.dp))

        Image(
            painter = painterResource(id = R.drawable.instagrampng),
            (R.string.instagram_description.toString())
        )

        Spacer(modifier = Modifier.height(30.dp))

        Button(
            onClick = { /* TODO: Facebook 로그인 처리 */ },
            modifier = Modifier.fillMaxWidth(),
            colors = ButtonDefaults.buttonColors(containerColor = Color.Blue)
        ) {
            Row (verticalAlignment = Alignment.CenterVertically){
                Image(
                    painter = painterResource(id = R.drawable.facebook),
                    contentDescription = "Facebook logo",
                    modifier = Modifier
                        .padding(end = 8.dp)
                        .size(24.dp),
                )
                Text(
                    "Continue with Facebook",
                    color = Color.White,
                    fontSize = 20.sp
                )
            }
        }


        Spacer(modifier = Modifier.height(30.dp))

        CustomDividerWithText()

        Spacer(modifier = Modifier.height(30.dp))

        TextField(
            value = "",
            onValueChange = { /* 할당 받은 변수를 업데이트 */ },
            modifier = Modifier.fillMaxWidth(),
            placeholder = { Text("phone number, username, or email") },
            singleLine = true
        )

        TextField(
            value = "",
            onValueChange = { /* 할당 받은 변수를 업데이트 */ },
            visualTransformation = PasswordVisualTransformation(),
            modifier = Modifier.fillMaxWidth(),
            placeholder = { Text("password") },
            singleLine = true
        )

        Text(
            text = "Forgot password?",
            color = Color.Blue,
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentWidth(Alignment.End)
                .clickable { /* TODO: 비밀번호 분실 처리 */ }
        )


        Spacer(modifier = Modifier.height(30.dp))

        Button(
            onClick = { /* TODO: 로그인 처리 */ },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Log In")
        }

        Spacer(modifier = Modifier.height(30.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ) {
            Text("Don't have an account?")
            Text(
                " Sign up",
                color = Color.Blue,
                modifier = Modifier
                    .clickable { /* TODO: 회원가입 처리 */ })
        }

        Spacer(modifier = Modifier.height(30.dp))

        Text("from FACEBOOK", fontSize = 12.sp)
    }
}

@Composable
fun CustomDividerWithText() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 12.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Divider(
            modifier = Modifier.weight(1f),
            color = Color.Gray,
            thickness = 1.dp
        )
        Text(
            text = "OR",
            modifier = Modifier.padding(horizontal = 8.dp),
            color = Color.Gray
        )
        Divider(
            modifier = Modifier.weight(1f),
            color = Color.Gray,
            thickness = 1.dp
        )
    }
}


@Preview(showBackground = true)
@Composable
fun PreviewInstagramLogin() {
    InstagramLoginScreen()
}
