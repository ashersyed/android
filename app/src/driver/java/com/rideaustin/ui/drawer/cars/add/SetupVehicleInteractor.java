package com.rideaustin.ui.drawer.cars.add;

import java.util.Set;

import rx.Observable;

/**
 * Created by rost on 8/10/16.
 */
public interface SetupVehicleInteractor {
    String getTitle();

    void onListItemSelected(String value);

    Observable<Set<String>> getListItems();

    void clear();
}
