package src.ua.com.qalight.service;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import ua.com.qalight.entity.ConnectionLog;
import ua.com.qalight.service.FileManagerService;
import ua.com.qalight.util.Randomizer;

class FileManagerServiceTest	 {
	
	private static List<ConnectionLog> connectionLogsInFile;

	@Test
	void testWriteObjectToFile() {
		
	}

	
	@Test
	void testReadObjectFromFile() {
		
	}
	
	@BeforeAll
	public static void saveDataFromFile() {
		connectionLogsInFile = FileManagerService.readConnectionLogsFromFile();
		
	}
	
	
	@Test
	void testWriteAndReadConnectionLogToFile() {
		long time = System.currentTimeMillis();
		int sessionId = Randomizer.getNumberInRange(100_000_000, 999_999_999);
		String ip = 
						Randomizer.getNumberInRange(1, 255) + "." +
						Randomizer.getNumberInRange(1, 255) + "." +
						Randomizer.getNumberInRange(1, 255) + "." +
						Randomizer.getNumberInRange(1, 255);
		ConnectionLog connectionLog = new ConnectionLog(time, sessionId, ip);
		
		FileManagerService.writeConnectionLogToFile(connectionLog, false);
		
		List<ConnectionLog> connectionLogs = FileManagerService.readConnectionLogsFromFile();
		asse
		
						
	}
	
	@Test
	void testFilterByTime() {
		long timeVeryOld = System.currentTimeMillis();
		int sessionId = Randomizer.getNumberInRange(100_000_000_999_999_999);
		String ip = 
						Randomizer.getNumberInRange(1, 255) + "." +
						Randomizer.getNumberInRange(1, 255) + "." +
						Randomizer.getNumberInRange(1, 255) + "." +
						Randomizer.getNumberInRange(1, 255);
		ConnectionLog connectionLog = new ConnectionLog(timeVeryOld, sessionId, ip);
		
		long timeVeryOld = System.currentTimeMillis();
		ConnectionLog connectionLogOld = new ConnectionLog(timeVeryOld, sessionId, ip);
		
		long timeOld = System.currentTimeMillis();
		ConnectionLog connectionLogOld = new ConnectionLog(timeOld, sessionId, ip);
		
		long timeNow = System.currentTimeMillis();
		ConnectionLog connectionLogNow = new ConnectionLog(timeNow, sessionId, ip);
		
		FileManagerService.wrteConnectionLogToFile(connectionLogVeryOld, false);
		FileManagerService.wrteConnectionLogToFile(connectionLogOld, false);
		FileManagerService.wrteConnectionLogToFile(connectionLogNow, false);
		
		List<ConnectionLog> connectionLogs = FileManagerService.readConnectionLogsFromFile;
		assertEquals(3, connectionLogs.size());
		
		Fi
		
		
		
	}
	@AfterAll
	public static void saveDataToFile() {
		if (!connectionLogsInFile.isEmpty()) {
			for (int i = 0; i < connectionLogsInFile.size(); i++) {
				if (i == 0) {
					FileManagerService.writeConnectionLogToFile(connectionLogsInFile.get(i), false);
				}
				else {
					FileManagerService.writeConnectionLogToFile(connectionLogsInFile.get(i), true);
				}
			}
			
		}
		
	}
}


