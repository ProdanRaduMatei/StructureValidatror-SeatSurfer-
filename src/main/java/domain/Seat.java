package domain;

public class Seat {
    private Integer id;
    private Integer number;
    private Integer row;
    private Integer column;
    private Boolean isSeat;
    private Boolean isOccupied;
    private Integer id_user;
    private Integer id_admin;

    public Seat(Integer id, Integer number, Integer row, Integer column,Boolean isSeat, Boolean isOccupied, Integer id_user, Integer id_admin) {
        this.id = id;
        this.number = number;
        this.row = row;
        this.column = column;
        this.isSeat = isSeat;
        this.isOccupied = isOccupied;
        this.id_user = id_user;
        this.id_admin = id_admin;
    }

    // Getters
    public Integer getId() {
        return id;
    }

    public Integer getNumber() {
        return number;
    }

    public Integer getRow() {
        return row;
    }

    public Integer getColumn() {
        return column;
    }

    public Boolean getIsSeat() {
        return isSeat;
    }

    public Boolean getIsOccupied() {
        return isOccupied;
    }

    public Integer getIdUser() {
        return id_user;
    }

    public Integer getIdAdmin() {
        return id_admin;
    }

    // Setters
    public void setId(Integer id) {
        this.id = id;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public void setRow(Integer row) {
        this.row = row;
    }

    public void setColumn(Integer column) {
        this.column = column;
    }

    public void setIsSeat(Boolean isSeat) {
        this.isSeat = isSeat;
    }

    public void setIsOccupied(Boolean isOccupied) {
        this.isOccupied = isOccupied;
    }

    public void setIdUser(Integer id_user) {
        this.id_user = id_user;
    }

    public void setIdAdmin(Integer id_admin) {
        this.id_admin = id_admin;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof Seat))
            return false;
        Seat seat = (Seat) o;
        if (!id.equals(seat.id))
            return false;
        if (!number.equals(seat.number))
            return false;
        if (!row.equals(seat.row))
            return false;
        if (!column.equals(seat.column))
            return false;
        if (!isSeat.equals(seat.isSeat))
            return false;
        if (!isOccupied.equals(seat.isOccupied))
            return false;
        if (!id_user.equals(seat.id_user))
            return false;
        return id_admin.equals(seat.id_admin);
    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = result + number.hashCode();
        result = result + row.hashCode();
        result = result + column.hashCode();
        result = result + isSeat.hashCode();
        result = result + isOccupied.hashCode();
        result = result + id_user.hashCode();
        result = result + id_admin.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Seat{" +
                "id=" + id +
                ", number=" + number +
                ", row=" + row +
                ", column=" + column +
                ", isSeat=" + isSeat +
                ", isOccupied=" + isOccupied +
                ", id_user=" + id_user +
                ", id_admin=" + id_admin +
                '}';
    }
}
