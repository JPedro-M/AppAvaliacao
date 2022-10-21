package com.example.appavaliao;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.TextView;

public class TelaPrincipal extends AppCompatActivity {
    private EditText etNome, etFilhos, etBruto;
    private RadioGroup rgSexo;
    private Button btCalcular, btFechar;
    private ImageView imgPessoa;
    private TextView txtBruto, txtInss, txtIr, txtVT, txtFamilia, txtLiquido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_principal);
        iniciarComponentes();
        etNome.addTextChangedListener(tw);
        etFilhos.addTextChangedListener(tw);
        rgSexo.setOnCheckedChangeListener(cl);

    }

    private void iniciarComponentes() {
        etNome = findViewById(R.id.etNome);
        etFilhos = findViewById(R.id.etFilhos);
        rgSexo = findViewById(R.id.rgSexo);
        btCalcular = findViewById(R.id.btCalcular);
        imgPessoa = findViewById(R.id.imgFamilia);
        btFechar = findViewById(R.id.btFechar);
        txtBruto = findViewById(R.id.txtBruto);
        txtInss = findViewById(R.id.txtInss);
        txtIr = findViewById(R.id.txtIR);
        txtVT = findViewById(R.id.txtVT);
        txtFamilia = findViewById(R.id.txtFamilia);
        txtLiquido = findViewById(R.id.txtLiquido);
        etBruto = findViewById(R.id.etBruto);
    }

    TextWatcher tw = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

        }

        @Override
        public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            if (!etFilhos.getText().toString().equals("")) {


                if (rgSexo.getCheckedRadioButtonId() == R.id.rbSexo1) {
                    if (Integer.parseInt(etFilhos.getText().toString()) <= 0) {
                        imgPessoa.setImageResource(R.drawable.homem);
                    } else {
                        imgPessoa.setImageResource(R.drawable.homem_filho);
                    }
                } else {
                    if (Integer.parseInt(etFilhos.getText().toString()) <= 0) {
                        imgPessoa.setImageResource(R.drawable.mulher);
                    } else {
                        imgPessoa.setImageResource(R.drawable.mulher_filho);
                    }
                }
            }
        }

        @Override
        public void afterTextChanged(Editable editable) {

        }
    };
    RadioGroup.OnCheckedChangeListener cl = new RadioGroup.OnCheckedChangeListener() {
        @Override
        public void onCheckedChanged(RadioGroup radioGroup, int i) {
            if (rgSexo.getCheckedRadioButtonId() == R.id.rbSexo1) {
                if (Integer.parseInt(etFilhos.getText().toString()) <= 0) {
                    imgPessoa.setImageResource(R.drawable.homem);
                } else {
                    imgPessoa.setImageResource(R.drawable.homem_filho);
                }
            } else {
                if (Integer.parseInt(etFilhos.getText().toString()) <= 0) {
                    imgPessoa.setImageResource(R.drawable.mulher);
                } else {
                    imgPessoa.setImageResource(R.drawable.mulher_filho);
                }
            }
        }
    };

    public void calcular(){
        double bruto, inss, ir, familia, vt, liquido;
        int filhos;

        bruto = Double.parseDouble(etBruto.getText().toString());
        filhos = Integer.parseInt(etFilhos.getText().toString());

        if (bruto <= 1212){

        }else if(bruto <= 2427.35 && bruto >= 1212.01){

        }else if (bruto <= 2427.35 && bruto >= 1212.01)
    }
}