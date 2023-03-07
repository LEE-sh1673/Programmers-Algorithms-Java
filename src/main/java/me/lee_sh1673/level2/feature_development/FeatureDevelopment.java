package me.lee_sh1673.level2.feature_development;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class FeatureDevelopment {

    private static final int MAX_PROCESS = 100;

    private final Queue<Integer> queue;

    public FeatureDevelopment() {
        queue = new LinkedList<>();
    }

    public int calculateRemainDay(final int progress, final int speed) {
        double remain = (MAX_PROCESS - progress) / (double) speed;
        return (int) Math.ceil(remain);
    }

    public int[] sol(int[] progresses, int[] speeds) {
        List<Integer> days = new ArrayList<>();

        for (int i = 0; i < progresses.length; i++) {
            int remainDay = calculateRemainDay(progresses[i], speeds[i]);

            if (!queue.isEmpty() && queue.peek() < remainDay) {
                days.add(queue.size());
                queue.clear();
            }
            queue.offer(remainDay);
        }
        days.add(queue.size());
        queue.clear();

        return days.stream()
            .mapToInt(Integer::intValue)
            .toArray();
    }
}
