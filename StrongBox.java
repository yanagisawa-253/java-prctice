import 参考書での学習.KeyType;

public class StrongBox<E> {

	private static final int PADLOCK = 0;
	private KeyType keytype;
	private E item;
	private long count;
	private int keyType;
	public StrongBox(KeyType key) {
		this.keytype = key;
	}
	
	public void put(E i) {
		this.item = i;
	}
	public E get() {
		this.count++;
		switch (this.keyType) {
		case PADLOCK:
		if (count < 1024) return null;
		break;
		
	    case BUTTON:
	    if (count < 10000) return null;
	    break;
	    
        case DIAL:
        if (count < 30000) return null;
        break;
        
        case FINGER:
        if (count < 100000) return null;
        break;
        }
        this.count = 0;
		return this.item;
	}
	
}
