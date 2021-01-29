package aplikasibelajar;

public enum JenisKelamin {
    LAKILAKI{
        @Override
        public String toString() {
            return "Laki-laki";
        }
    },
    PEREMPUAN{
        @Override
        public String toString() {
            return "Perempuan";
        }
    }
}
