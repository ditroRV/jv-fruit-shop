package core.basesyntax.implementation;

import core.basesyntax.activity.ActivityHandler;
import core.basesyntax.activity.ActivityStrategy;
import java.util.Map;

public class ActivityStrategyImpl implements ActivityStrategy {
    private final Map<String, ActivityHandler> activities;

    public ActivityStrategyImpl(Map<String, ActivityHandler> activities) {
        this.activities = activities;
    }

    @Override
    public ActivityHandler getActivity(String activity) {
        return activities.get(activity);
    }
}
