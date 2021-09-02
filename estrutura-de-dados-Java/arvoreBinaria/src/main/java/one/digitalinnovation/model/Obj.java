package one.digitalinnovation.model;

public class Obj extends ObjTree<Obj>{

    Integer value;

    public Obj(Integer value){
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Obj obj = (Obj) o;

        return value != null ? value.equals(obj.value) : obj.value == null;
    }

    @Override
    public int hashCode() {
        return value != null ? value.hashCode() : 0;
    }

    @Override
    public int compareTo(Obj other) {
        int i = 0;

        if (this.value > other.value){
            i = 1;
        }else if(this.value < other.value){
            i = -1;
        }

        return i;
    }

    @Override
    public String toString() {
        return value.toString();
    }
}
