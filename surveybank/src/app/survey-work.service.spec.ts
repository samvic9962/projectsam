import { TestBed } from '@angular/core/testing';

import { SurveyWorkService } from './survey-work.service';

describe('SurveyWorkService', () => {
  let service: SurveyWorkService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(SurveyWorkService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
