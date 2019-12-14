import { TestBed } from '@angular/core/testing';

import { AcserviceService } from './acservice.service';

describe('AcserviceService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: AcserviceService = TestBed.get(AcserviceService);
    expect(service).toBeTruthy();
  });
});
