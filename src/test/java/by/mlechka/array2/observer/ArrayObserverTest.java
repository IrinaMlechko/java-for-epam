//package by.mlechka.array2.observer;
//
//import by.mlechka.array2.model.DataArray;
//import by.mlechka.array2.observer.impl.ArrayObserver;
//import by.mlechka.array2.service.DataArrayService;
//import org.junit.jupiter.api.Test;
//import org.mockito.Mock;
//import org.mockito.MockitoAnnotations;
//import static org.mockito.Mockito.*;
//
//class ArrayObserverTest {
//
//    @Mock
//    private DataArrayService dataArrayService;
//
//    @Mock
//    private DataArray dataArray;
//
//    @Test
//    void testParameterChanged() {
//        MockitoAnnotations.initMocks(this);
//        ArrayObserver observer = new ArrayObserver();
//        ArrayEvent arrayEvent = new ArrayEvent(dataArray);
//        observer.parameterChanged(arrayEvent);
//        verify(dataArrayService, times(1)).findMinValue(dataArray);
//        verify(dataArrayService, times(1)).findMaxValue(dataArray);
//        verify(dataArrayService, times(1)).calculateSum(dataArray);
//        verify(dataArrayService, times(1)).findAverageValue(dataArray);
//        verifyNoMoreInteractions(dataArrayService);
//    }
//}
//
