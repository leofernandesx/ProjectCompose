package com.leofd.projectcompose.pages

import androidx.compose.runtime.*
import com.leofd.projectcompose.components.H1
import com.leofd.projectcompose.components.H2
import com.leofd.projectcompose.components.H3
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.core.Page
import com.varabyte.kobweb.silk.components.forms.Button
import org.jetbrains.compose.web.attributes.InputType
import org.jetbrains.compose.web.attributes.placeholder
import org.jetbrains.compose.web.css.Color
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.Button
import org.jetbrains.compose.web.dom.H1
import org.jetbrains.compose.web.dom.Input
import org.jetbrains.compose.web.dom.Text

@Page
@Composable
fun HomePage() {

    var email by remember {
        mutableStateOf("")
    }

    var senha by remember {
        mutableStateOf("")
    }

    var mensagem by remember {
        mutableStateOf("")
    }

    Column(
        modifier = Modifier.fillMaxSize().backgroundColor(Colors.SkyBlue),
        verticalArrangement =  Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally

    ){

        H1(
            txt = "Project Compose",
            cor = Colors.DarkBlue
        )

        Box(
            modifier = Modifier.width(500.px).height(500.px).backgroundColor(Colors.White)
                .borderRadius(30.px)

        ){
            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ){
                H2(
                    txt2 = "LOGIN",
                    cor = Colors.Black
                )

                Input(
                    type = InputType.Email,
                    attrs = Modifier.width(400.px).padding(28.px).fontSize(20.px).margin(0.px, 0.px, 10.px, 0.px)
                        .toAttrs{
                            placeholder("Digite o seu email")
                            onInput {
                                email =it.value
                            }
                        }
                )

                Input(
                    type = InputType.Password,
                    attrs = Modifier.width(400.px).padding(28.px).fontSize(20.px).margin(0.px, 0.px, 30.px, 0.px)
                        .toAttrs{
                            placeholder("Digite a sua senha")
                            onInput {
                                senha = it.value
                            }
                        }
                )

                Button(
                    onClick = {

                        if(email.isEmpty() || senha.isEmpty()){
                            mensagem = "Preencha todos os campos!"
                        }else if (email.equals("leo980@gmail.com") && senha.equals("123456")){
                            mensagem = "Login efetuado com sucesso"
                        }

                    },
                    modifier = Modifier.backgroundColor(Colors.DeepSkyBlue).width(400.px).height(60.px).padding(5.px)
                        .borderRadius(30.px)
                ){
                    H3(
                        txt3 = "Entrar",
                        cor = Colors.White
                    )
                }
                H3(
                    txt3 = "$mensagem",
                    cor = Colors.Black
                )
            }
        }

    }
}
