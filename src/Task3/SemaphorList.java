package Task3;

import java.util.*;
import java.util.concurrent.Semaphore;

public class SemaphorList<E> implements List<E> {
    private Semaphore semaphore = new Semaphore(1);

    // permits - количество разрешений для потока, т.е. сколько потоков имеют доступ к ресурсу
    private List<E> list = new ArrayList<>();

    @Override
    public int size() {
        int size = 0;
        try {
            semaphore.acquire(); // начинаем взаимодействие с ресурсом
            size = list.size();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            semaphore.release(); // заканчиваем использовать ресурс
        }
        return size;
    }

    @Override
    public boolean isEmpty() {
        boolean temp = true;
        try {
            semaphore.acquire();
            temp = list.isEmpty();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            semaphore.release();
        }
        return temp;
    }

    @Override
    public boolean contains(Object o) {
        boolean temp = false;
        try {
            semaphore.acquire();
            temp = list.contains(o);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            semaphore.release();
        }
        return temp;
    }

    @Override
    public Iterator<E> iterator() {
        Iterator<E> iterator = null;
        try {
            semaphore.acquire();
            iterator = list.iterator();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            semaphore.release();
        }
        return iterator;
    }

    @Override
    public Object[] toArray() {
        Object[] objects = new Object[]{};
        try {
            semaphore.acquire();
            objects = list.toArray();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            semaphore.release();
        }
        return objects;
    }

    @Override
    public <T> T[] toArray(T[] a) {
        Object[] objects = new Object[]{};
        try {
            semaphore.acquire();
            objects = list.toArray();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            semaphore.release();
        }
        return (T[]) objects;
    }

    @Override
    public boolean add(E e) {
        boolean addStatus = false;
        try {
            semaphore.acquire();
            addStatus = list.add(e);
        } catch (InterruptedException er) {
            er.printStackTrace();
        } finally {
            semaphore.release();
        }
        return addStatus;
    }

    @Override
    public boolean remove(Object o) {
        boolean removeStatus = false;
        try {
            semaphore.acquire();
            removeStatus = list.remove(o);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            semaphore.release();
        }
        return removeStatus;
    }



    @Override
    public boolean containsAll(Collection<?> c) {
        boolean containsStatus = false;
        try {
            semaphore.acquire();
            containsStatus = list.containsAll(c);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            semaphore.release();
        }
        return containsStatus;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        boolean temp = false;
        try {
            semaphore.acquire();
            temp = list.addAll(c);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            semaphore.release();
        }
        return temp;
    }

    @Override
    public boolean addAll(int index, Collection<? extends E> c) {
        boolean temp = false;
        try {
            semaphore.acquire();
            temp = list.addAll(index, c);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            semaphore.release();
        }
        return temp;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        boolean temp = false;
        try {
            semaphore.acquire();
            temp = list.removeAll(c);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            semaphore.release();
        }
        return temp;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        boolean temp = false;
        try {
            semaphore.acquire();
            temp = list.retainAll(c);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            semaphore.release();
        }
        return temp;
    }

    @Override
    public void clear() {
        try {
            semaphore.acquire();
            list.clear();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            semaphore.release();
        }
    }

    @Override
    public E get(int index) {
        E temp = null;
        try {
            semaphore.acquire();
            temp = list.get(index);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            semaphore.release();
        }
        return temp;
    }

    @Override
    public E set(int index, E element) {
        E temp = null;
        try {
            semaphore.acquire();
            temp = list.set(index, element);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            semaphore.release();
        }
        return temp;
    }

    @Override
    public void add(int index, E element) {
        try {
            semaphore.acquire();
            list.add(index, element);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            semaphore.release();
        }
    }

    @Override
    public E remove(int index) {
        E temp = null;
        try {
            semaphore.acquire();
            temp = list.remove(index);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            semaphore.release();
        }
        return  temp;
    }

    @Override
    public int indexOf(Object o) {
        int temp = 0;
        try {
            semaphore.acquire();
            temp = list.indexOf(o);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            semaphore.release();
        }
        return  temp;
    }

    @Override
    public int lastIndexOf(Object o) {
        int temp = 0;
        try {
            semaphore.acquire();
            temp = list.lastIndexOf(o);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            semaphore.release();
        }
        return  temp;
    }

    @Override
    public ListIterator<E> listIterator() {
        ListIterator<E> listIt = null;
        boolean status = false;
        try {
            semaphore.acquire();
            listIt = list.listIterator();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            semaphore.release();
        }
        return listIt;
    }

    @Override
    public ListIterator<E> listIterator(int index) {
        ListIterator<E> listIt = null;
        boolean status = false;
        try {
            semaphore.acquire();
            listIt = list.listIterator(index);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            semaphore.release();
        }
        return listIt;
    }

    @Override
    public List<E> subList(int fromIndex, int toIndex) {
        boolean status = false;
        List<E> subList = null;
        try {
            semaphore.acquire();
            subList = list.subList(fromIndex,toIndex);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            semaphore.release();
        }
        return subList;
    }
}
