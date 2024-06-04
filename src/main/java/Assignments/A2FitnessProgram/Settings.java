package Assignments.A2FitnessProgram;

import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType (XmlAccessType.FIELD)
public class Settings {
    @XmlElement(name = "Name")
    private String name;

    @XmlElement(name = "Weight")
    private int weight;

    @XmlElement(name = "Height")
    private int height;

    @XmlElement(name = "Birthday")
    private String birthday;

    @XmlElement(name = "FTP")
    private int ftp;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeight() {
        return this.height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return this.weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getBirthday() {
        return this.birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public int getFTP() {
        return this.ftp;
    }

    public void setFtp(int ftp) {
        this.ftp = ftp;
    }
}
