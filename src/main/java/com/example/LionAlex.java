package com.example;

import java.util.ArrayList;
import java.util.List;

public class LionAlex extends Lion {

    private final List<String> startFriends = List.of("Марти", "Глория", "Мелман");
    private final List<String> friendsList = new ArrayList<>(startFriends);
    private String placeOfLiving = "Нью-Йоркский Зоопарк";

    public LionAlex(Feline feline) throws Exception {
        super("Самец", feline);
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
        if (!friendsList.contains(friend)){
            throw new Exception(String.format("Алекс и так не дружит с %s!", friend));
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
