package com.inventoriaja.core.test;

import com.inventoriaja.core.SwingHelper;
import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;
import org.junit.Test;
import static org.junit.Assert.*;

public class SwingHelperTest {

    @Test
    public void testGetSelectedButtonText_tombolDipilih() {
        ButtonGroup grup = new ButtonGroup();
        JRadioButton tombol1 = new JRadioButton("Opsi 1");
        JRadioButton tombol2 = new JRadioButton("Opsi 2");
        grup.add(tombol1);
        grup.add(tombol2);
        tombol1.setSelected(true);

        String hasil = SwingHelper.getSelectedButtonText(grup);
        assertEquals("Opsi 1", hasil);
    }

    @Test
    public void testGetSelectedButtonText_tanpaPilihan() {
        ButtonGroup grup = new ButtonGroup();
        JRadioButton tombol1 = new JRadioButton("Opsi 1");
        JRadioButton tombol2 = new JRadioButton("Opsi 2");
        grup.add(tombol1);
        grup.add(tombol2);

        String hasil = SwingHelper.getSelectedButtonText(grup);
        assertNull(hasil);
    }

    @Test
    public void testGetSelectedButtonText_grupKosong() {
        ButtonGroup grup = new ButtonGroup();
        String hasil = SwingHelper.getSelectedButtonText(grup);
        assertNull(hasil);
    }
}