import java.util.*;

class MinStack {
    List<int[]> st;

    public MinStack() {
        st = new ArrayList<>();
    }

    public void push(int val) {
        if (st.isEmpty()) {
            st.add(new int[]{val, val});
        } else {
            int min = st.get(st.size() - 1)[1];
            st.add(new int[]{val, Math.min(val, min)});
        }
    }

    public void pop() {
        if (!st.isEmpty()) {
            st.remove(st.size() - 1);
        }
    }

    public int top() {
        return st.isEmpty() ? -1 : st.get(st.size() - 1)[0];
    }

    public int getMin() {
        return st.isEmpty() ? -1 : st.get(st.size() - 1)[1];
    }
}
