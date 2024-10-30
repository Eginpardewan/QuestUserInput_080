package com.example.activity5

import android.inputmethodservice.Keyboard.Row
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true)
@Composable
fun Mainclass(
    modifier: Modifier = Modifier
) {
    var nama by rememberSaveable { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var alamat by remember { mutableStateOf("") }
    var nohp by remember { mutableStateOf("") }
    var selectedgender by remember { mutableStateOf("") }

    val jnsKelamin = listOf("laki-laki", "perempuan")

    var username by rememberSaveable { mutableStateOf("") }
    var useremail by remember { mutableStateOf("") }
    var useralamat by remember { mutableStateOf("") }
    var usernohp by remember { mutableStateOf("") }
    var usergender by remember { mutableStateOf("") }

    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        OutlinedTextField(
            value = nama,
            onValueChange = { nama = it },
            placeholder = { Text("Masukkan nama") },
            label = { Text("Nama") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(5.dp))
        Row (){
            jnsKelamin.forEach { item ->
                Row (verticalAlignment = Alignment.CenterVertically){ RadioButton(
                    selected = selectedgender == item,
                    onClick = {
                        selectedgender = item
                    }
                ) }
                Text(item)
            }
        }

        OutlinedTextField(
            value = email,
            onValueChange = { email = it },
            placeholder = { Text("Masukkan nama") },
            label = { Text("Nama") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(5.dp))

        OutlinedTextField(
            value = alamat,
            onValueChange = { alamat = it },
            placeholder = { Text("Masukkan nama") },
            label = { Text("Nama") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(5.dp))

        OutlinedTextField(
            value = nohp,
            onValueChange = { nohp = it },
            placeholder = { Text("Masukkan nama") },
            label = { Text("Nama") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(5.dp))

        Button(onClick ={
            username = nama
            usergender = selectedgender
            useremail = email
            useralamat = alamat
            usernohp = nohp
        } ) {
            Text("Simpan")
        }
        Card(modifier.size(height = 40.dp, width =  400.dp)) {
            CardSection(Judul = "Nama", IsiJudul = username)
            CardSection(Judul = "Jenis Kelamin", IsiJudul = usergender)
            CardSection(Judul = "Email", IsiJudul = useremail)
            CardSection(Judul = "Alamat", IsiJudul = useralamat)
            CardSection(Judul = "No Telephon", IsiJudul = usernohp)
        }

    }
}
@Composable
fun 