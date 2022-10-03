package net.htlgrieskirchen.pos3.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Streams {

    int[] randoms;
    public Streams(){

        randoms = new int[1000];

        randoms = Arrays.stream(randoms).map(s -> (int)(Math.random()*100)).toArray();


    }

    public double average(int[] numbers) {
        return 0;
    }

    public List<String> upperCase(String[] strings) {
        return null;
    }

    public Weapon findWeaponWithLowestDamage(List<Weapon> weapons) {
        return null;
    }

    public Weapon findWeaponWithHighestStrength(List<Weapon> weapons) {
        return null;
    }

    public List<Weapon> collectMissileWeapons(List<Weapon> weapons) {
        return null;
    }

    public Weapon findWeaponWithLongestName(List<Weapon> weapons) {
        return null;
    }

    public List<String> toNameList(List<Weapon> weapons) {
        return null;
    }

    public int[] toSpeedArray(List<Weapon> weapons) {
        return null;
    }

    public int sumUpValues(List<Weapon> weapons) {
        return 0;
    }

    public long sumUpHashCodes(List<Weapon> weapons) {
        return 0;
    }

    public List<Weapon> removeDuplicates(List<Weapon> weapons) {
        return null;
    }

    public void increaseValuesByTenPercent(List<Weapon> weapons) {
       //implement this
    }
}
