package id.sulistiyanto.pendaftaranpraktikum;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class UpdateActivity extends AppCompatActivity {

    @BindView(R.id.radioSesi) RadioGroup radioGroup;
    @BindView(R.id.radioPagi) RadioButton radioButtonPagi;
    @BindView(R.id.radioSiang) RadioButton radioButtonSiang;
    @BindView(R.id.editTextNPM) EditText editTextNPM;
    @BindView(R.id.editTextNama) EditText editTextNama;
    @BindView(R.id.editTextKelas) EditText editTextKelas;

    @OnClick(R.id.buttonUbah) void ubah() {

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update);
        ButterKnife.bind(this);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Ubah Data");

        Intent intent = getIntent();
        String npm = intent.getStringExtra("npm");
        String nama = intent.getStringExtra("nama");
        String kelas = intent.getStringExtra("kelas");
        String sesi = intent.getStringExtra("sesi");

        editTextNPM.setText(npm);
        editTextNama.setText(nama);
        editTextKelas.setText(kelas);

        if (sesi.equals("Pagi (09.00-11.00 WIB)")) {
            radioButtonPagi.setChecked(true);
        } else {
            radioButtonSiang.setChecked(true);
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
