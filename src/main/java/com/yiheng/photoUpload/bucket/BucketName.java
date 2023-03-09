package com.yiheng.photoUpload.bucket;

public enum BucketName {
        PROFILE_IMAGE("yiheng-photo-upload");
        private final String bucketName;
        BucketName( String bucketName){
            this.bucketName = bucketName;
        }
        public String getBucketName(){
            return bucketName;
        }
}
