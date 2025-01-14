package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class LionAlex extends Lion {

    private final Set<String> startFriends = Set.of("Марти", "Глория", "Мелман");
    private final List<String> friendsList = new ArrayList<>(startFriends);
    private String placeOfLiving = "Нью-Йоркский Зоопарк";

    LionAlex(Feline feline) throws Exception {
        super("Cамец", feline);
    }

    @Override
    public int getKittens(){
        return feline.getKittens(0);
    }

    public List<String> getFriendsList(){
        return friendsList;
    }

    public void addFriend(String friend){
        friendsList.add(friend);
    }

    public void removeFriend(String friend) throws Exception{
        if (startFriends.contains(friend)){
            throw new Exception(String.format("Алекс никогда не перестанет дружить с %s!", friend));
        }
        friendsList.remove(friend);
    }

    public String getPlaceOfLiving() {
        return placeOfLiving;
    }

    public void setPlaceOfLiving(String newPlaceOfLiving) {
        placeOfLiving = newPlaceOfLiving;
    }
}
