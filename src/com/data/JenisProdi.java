/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.data;

/**
 *
 * @author Jerry Pangaribuan
 */
public enum JenisProdi {
    D4TRPL{
        @Override
        public String toString() {
            return "D4TRPL";
        }
    },
    D3TI{
        @Override
        public String toString() {
            return "D3 Teknologi Rekayasa Perangkat Lunak";
        }
    },
    S1IF{
        @Override
        public String toString() {
            return "S1 Informatika";
        }
    },
    S1SI{
        @Override
        public String toString() {
            return "S1 Sistem Informasi";
        }
    },
    D3TK{
        @Override
        public String toString() {
            return "D3 Teknologi Komputer";
        }
    },
    S1TE{
        @Override
        public String toString() {
            return "S1 Teknik Elektro";
        }
    },
    S1MR{
        @Override
        public String toString() {
            return "S1 Manajemen Rekayasa";
        }
    },
    S1BP{
        @Override
        public String toString() {
            return "S1 Teknik Bioproses";
        }
    }
}
