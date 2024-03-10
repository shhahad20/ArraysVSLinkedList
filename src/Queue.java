public interface Queue {
        public void insert(Object ob);
        public Object remove();
        public Object peek();
        public boolean isEmpty();
        public int size(); 
}
