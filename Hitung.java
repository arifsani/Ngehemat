package com.example.arifsanii.ngehemat;

public class Hitung extends Panggil{

    @Override
    public int hitungharian(int jumlah) {
        return super.hitungharian(jumlah);
    }

    @Override
    public int hitungmingguan(int jumlah) {
        super.hitungmingguan(jumlah);
        return 7 * jumlah;
    }

    @Override
    public int hitungbulanan(int jumlah) {
        super.hitungbulanan(jumlah);
        return jumlah;
    }
}
