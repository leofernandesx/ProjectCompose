package com.leofd.projectcompose.components

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Color
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.color
import com.varabyte.kobweb.compose.ui.modifiers.fontSize
import com.varabyte.kobweb.compose.ui.modifiers.fontWeight
import com.varabyte.kobweb.compose.ui.toAttrs
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.P
import org.jetbrains.compose.web.dom.Text

@Composable
fun H1(

    txt: String,
    cor: Color
){


    P(
        attrs = Modifier.fontSize(40.px).fontWeight(FontWeight.Bold).color(cor).toAttrs()
    ){
        Text(txt)
    }
}
@Composable
fun H2(

    txt2: String,
    cor: Color
){


    P(
        attrs = Modifier.fontSize(28.px).fontWeight(FontWeight.Bold).color(cor).toAttrs()
    ){
        Text(txt2)
    }
}

@Composable
fun H3(

    txt3: String,
    cor: Color
){


    P(
        attrs = Modifier.fontSize(18.px).fontWeight(FontWeight.Bold).color(cor).toAttrs()
    ){
        Text(txt3)
    }
}
