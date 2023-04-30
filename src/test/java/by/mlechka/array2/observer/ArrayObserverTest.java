package by.mlechka.array2.observer;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

import by.mlechka.array2.observer.impl.ArrayObserver;
import org.junit.*;
import org.mockito.*;

import by.mlechka.array2.model.*;
import by.mlechka.array2.service.DataArrayService;

public class ArrayObserverTest {

    private ArrayObserver observer;
    private DataArrayService mockService;
    private Warehouse mockWarehouse;

    @Before
    public void setUp() {
        mockService = mock(DataArrayService.class);
        mockWarehouse = mock(Warehouse.class);
        observer = new ArrayObserver();
    }

    @Test
    public void testParameterChanged() {
        int[] testData = {1, 2, 3, 4, 5};
        DataArray array = new DataArray(testData);

        when(mockService.findMinValue(array)).thenReturn(1);
        when(mockService.findMaxValue(array)).thenReturn(5);
        when(mockService.calculateSum(array)).thenReturn(15);
        when(mockService.findAverageValue(array)).thenReturn(3.0);

        observer.parameterChanged(new ArrayEvent(array));

        ArgumentCaptor<ArrayStatistics> statisticsCaptor = ArgumentCaptor.forClass(ArrayStatistics.class);

        verify(mockService).findMinValue(array);
        verify(mockService).findMaxValue(array);
        verify(mockService).calculateSum(array);
        verify(mockService).findAverageValue(array);

        verify(mockWarehouse).put(eq(array.getId()), statisticsCaptor.capture());

        ArrayStatistics expectedStatistics = new ArrayStatistics(1, 5, 15, 3.0);
        ArrayStatistics actualStatistics = statisticsCaptor.getValue();
        assertEquals(expectedStatistics, actualStatistics);
    }
}
