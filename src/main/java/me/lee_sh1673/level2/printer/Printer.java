package me.lee_sh1673.level2.printer;

import java.util.LinkedList;
import java.util.Queue;

public class Printer {

    private final Queue<Document> documents;

    private final int location;


    private static class Document {

        private final int order;

        private final int priority;

        public Document(final int order, final int priority) {
            this.order = order;
            this.priority = priority;
        }

        @Override
        public String toString() {
            return "Document{" +
                "order=" + order +
                ", priority=" + priority +
                '}';
        }
    }

    public Printer(int[] priorities, int location) {
        this.documents = new LinkedList<>();
        this.location = location;
        mapDocuments(priorities);
    }

    private void mapDocuments(final int[] priorities) {
        for (int i = 0; i < priorities.length; i++) {
            documents.offer(new Document(i, priorities[i]));
        }
    }

    public int sol() {
        int answer = 0;

        while (true) {
            Document document = documents.poll();

            if (!isMaximumPriority(document)) {
                documents.offer(document);
            } else {
                answer++;

                if (matchLocation(document)) {
                    return answer;
                }
            }
        }
    }

    private boolean isMaximumPriority(final Document curr) {
        return documents.stream()
            .allMatch(document -> curr.priority >= document.priority);
    }

    private boolean matchLocation(final Document document) {
        return document != null && document.order == location;
    }
}
