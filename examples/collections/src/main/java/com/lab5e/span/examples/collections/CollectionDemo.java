package com.lab5e.span.examples.collection;
import com.lab5e.span.CollectionsApi;
import com.lab5e.ApiClient;
import com.lab5e.span.model.Collection;
import com.lab5e.span.model.ListCollectionResponse;
import com.lab5e.ApiException;

public class CollectionDemo {
    public static void main(String args[]) {

        // Pull the token from the command line
        if (args.length < 1) {
            System.out.println("Must specify token on command line");
            return;
        }
        final String token = args[0];

        // Create the API client class and set the API token for it.
        final ApiClient client = new ApiClient();
        client.setApiKey(token);

        // Use the ProfileApi class to retrieve the profile
        final CollectionsApi collApi = new CollectionsApi(client);

        try {
            // This will retrieve the profile. If there's an error retrieving
            // the profile an ApiException is thrown.
            final ListCollectionResponse list = collApi.listCollections();
            for (final Collection coll : list.getCollections()) {
                System.out.println(coll.getCollectionId() + " " + coll.getTags().get("name"));
            }


        } catch (ApiException ex) {
            System.out.println("Got exception calling API: code = " + ex.getCode());
        }
    }
}
