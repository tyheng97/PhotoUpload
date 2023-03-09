package com.yiheng.photoUpload.datastore;

import com.yiheng.photoUpload.profile.UserProfile;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
@Repository
public class FakeUserProfileDataStore {
    private static final List<UserProfile> USER_PROFILES = new ArrayList<>();

    static {
        USER_PROFILES.add(new UserProfile(UUID.fromString("c0fc6ece-7029-4170-b29c-999a71a2e667"), "wakanda", null));
        USER_PROFILES.add(new UserProfile(UUID.fromString("02849fdf-6c84-4258-95d8-1af62818572e"), "ironMan", null));
    }

    public List<UserProfile> getUserProfiles(){
        return USER_PROFILES;
    }
}
