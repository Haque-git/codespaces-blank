// NO NEED THIS SUBMIT THIS CLASS
public class WRM {
    Patient dh;

    //The constructor is already created for you
    public WRM() {
        dh = new Patient(null, null, null, null, null, null);
        dh.next = dh;
        dh.prev = dh;
    }

    public void registerPatient(int id, String name, int age, String bloodgroup) {
        Patient pn = dh;
        while (pn.next != dh) {
            pn = pn.next;
        }

        pn.next = new Patient(id, name, age, bloodgroup, dh, pn);
        dh.prev = pn.next;

    }

    public void servePatient() {
        if (this.canDoctorGoHome()) {
            return;
        }
        dh.next = dh.next.next;
        dh.next.prev = dh;
    }

    public void showAllPatient() {
        Patient cn = dh.next;
        while (cn != dh) {
            System.out.println(cn.id);
            cn = cn.next;
        }
    }

    public Boolean canDoctorGoHome() {
        return dh.next == dh;
    }

    public void cancelAll() {
        dh.next = dh;
        dh.prev = dh;
    }


    public void reverseTheLine() {
        Patient curr = dh;
        Patient temp = null;

        do {
            temp = curr.next;
            curr.next = curr.prev;
            curr.prev = temp;
            curr = curr.prev;
        } while (curr != dh);
    }

}
